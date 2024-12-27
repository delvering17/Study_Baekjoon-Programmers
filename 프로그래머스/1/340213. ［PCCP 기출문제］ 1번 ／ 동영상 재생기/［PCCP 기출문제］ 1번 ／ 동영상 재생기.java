class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Time video = new Time(video_len);
        Time current = new Time(pos);
        Time openingStart = new Time(op_start);
        Time openingEnd = new Time(op_end);

        if (isOpeningSequence(openingStart, openingEnd, current)) {
            current = new Time(openingEnd.toString());
        }
        for (String command : commands) {
            if (command.equals("prev")) {
                current.goBack();
            }

            if (command.equals("next")) {
                current.goForward();
            }

            if (current.compareTo(new Time("00:00")) < 0) {
                current = new Time("00:00");
            } else if (current.compareTo(video) > 0) {
                current = new Time(video.toString());
            }

            if (isOpeningSequence(openingStart, openingEnd, current)) {
                current = new Time(openingEnd.toString());
            }
        }

        return current.toString();
    }

    class Time {
        int minute;
        int second;

        private int COMMAND_SECOND = 10;

        public Time(String str) {
            this.minute = Integer.parseInt(str.split(":")[0]);
            this.second = Integer.parseInt(str.split(":")[1]);
        }

        public void goBack() {
            second -= COMMAND_SECOND;
            if (second < 0) {
                second += 60;
                minute--;
            }
        }

        public void goForward() {
            second += COMMAND_SECOND;
            if (second >= 60) {
                second -= 60;
                minute++;
            }
        }

        public int compareTo(Time other) {
            if (this.minute != other.minute) {
                return Integer.compare(this.minute, other.minute);
            }
            return Integer.compare(this.second, other.second);
        }

        public String toString() {
            return String.format("%02d:%02d", minute, second);
        }

    }

    public boolean isOpeningSequence(Time openingStart, Time openingEnd, Time current) {
        return current.compareTo(openingStart) >= 0 && current.compareTo(openingEnd) <= 0;
    }

}