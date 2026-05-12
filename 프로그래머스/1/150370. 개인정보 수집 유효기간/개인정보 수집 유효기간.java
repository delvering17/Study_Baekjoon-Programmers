import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
   public static Term[] terms;
    private LocalDate today;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public int[] solution(String todayString, String[] termStrings, String[] privateStrings) {
        today = parseDate(todayString);
        List<Integer> shouldDestructionPrivateSequences = new ArrayList<>();
        terms = getTerms(termStrings);
        Private[] privates = getPrivates(privateStrings);

        for (Private privateInfo : privates) {
            if (privateInfo.isDestruction(today)) {
                shouldDestructionPrivateSequences.add(privateInfo.getSequence());
            }
        }

        return shouldDestructionPrivateSequences.stream().mapToInt(Integer::intValue).toArray();
    }

    private Term getTermByType(String termType) {
        for (Term term : terms) {
            if (term.type.equals(termType)) {
                return term;
            }
        }

        return null;
    }

    private Private[] getPrivates(String[] privateStrings) {
        return IntStream.range(0, privateStrings.length)
                .mapToObj(i -> {
                    String term = privateStrings[i];

                    String[] string = term.split(" ");
                    return new Private(i + 1, parseDate(string[0]), getTermByType(string[1]));
                })
                .toArray(Private[]::new);
    }

    private Term[] getTerms(String[] termStrings) {
        return Arrays.stream(termStrings)
                .map(term -> {
                    String[] string = term.split(" ");
                    return new Term(string[0], Integer.parseInt(string[1]));
                })
                .toArray(Term[]::new);
    }

    class Term {
        String type;
        int limitMonth;

        public Term(String type, int limitMonth) {
            this.type = type;
            this.limitMonth = limitMonth;
        }
    }
    
    class Private {
        int sequence;
        Term term;
        LocalDate collectDate;
        LocalDate destructionDate;

        public Private(int sequence, LocalDate collectDate, Term term) {
            this.sequence = sequence;
            this.collectDate = collectDate;
            this.term = term;
            this.destructionDate = collectDate.plusMonths(term.limitMonth);
        }

        public boolean isDestruction(LocalDate today) {
            return today.isEqual(destructionDate) || today.isAfter(destructionDate);
        }

        public int getSequence() {
            return this.sequence;
        }
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, formatter);
    }
    
}