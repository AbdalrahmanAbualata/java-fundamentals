package inheritance;

    public class Review {
        private String body;
        private String author;
        private int numOfStars;
        public void setNumOfStars(int numOfStars) {
            if (numOfStars >= 0 && numOfStars <= 5) {
                this.numOfStars = numOfStars;
            }else {
                this.numOfStars = 3;
            }
        }

        public Review( String body, String author, int numOfStars) {
            this.body = body;
            this.author = author;
            this.setNumOfStars(numOfStars);
        }

        public int getStars() {
            return numOfStars;
        }
        @Override
        public String toString() {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numOfStars=" + numOfStars +
                    '}';
        }
}
