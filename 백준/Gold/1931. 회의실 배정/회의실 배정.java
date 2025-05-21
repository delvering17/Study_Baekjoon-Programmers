import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(br.readLine());

        List<Meeting> meetingList = readMeetingList(meetingCount, br);
        sortMeetingList(meetingList);

        int availableMaxMeetingCount = 0;
        int beforeMeetingEndTime = 0;
        for (Meeting meeting : meetingList) {
            if (beforeMeetingEndTime <= meeting.startTime) {
                availableMaxMeetingCount ++;
                beforeMeetingEndTime = meeting.endTime;
            }
        }

        System.out.println(availableMaxMeetingCount);
    }

    private static void sortMeetingList(List<Meeting> meetingList) {
        meetingList.sort(Comparator
                .comparingInt((Meeting m) -> m.endTime)
                .thenComparingInt(m -> m.startTime)
        );
    }

    private static List<Meeting> readMeetingList(int meetingCount, BufferedReader br) throws IOException {
        List<Meeting> meetingList = new ArrayList<>();
        for (int i = 0; i < meetingCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetingList.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        return meetingList;
    }

    private static class Meeting {
        public final int startTime;
        public final int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public boolean containsMeetingTime(Meeting meeting) {
            return this.startTime <= meeting.startTime && this.endTime >= meeting.endTime;
        }
    }

}
