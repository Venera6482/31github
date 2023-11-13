package edabit;

public class Upvotes {
        public static int getVoteCount(int upvotes,int downvotes) {
            return upvotes-downvotes;
        }

    public static void main(String[] args) {
        getVoteCount(12, -45);

    }
}
