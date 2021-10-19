package inheritance;

    public class Review {
        private String body;
        private String author;
        private int numOfStars;
        private String movie;
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

        public Review( String body, String author, int numOfStars,String movie) {
            this.body = body;
            this.author = author;
            this.setNumOfStars(numOfStars);
            this.movie=movie;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
        public int getStars() {
            return numOfStars;
        }

        @Override
        public String toString() {
            String msg="";
            if (this.movie != null) {
                msg = "Review{" +
                        "body='" + body + '\'' +
                        ", author='" + author + '\'' +
                        ", numOfStars=" + numOfStars +
                        ", movie=" + movie +
                        '}';
            }else {
                msg="Review{" +
                        "body='" + body + '\'' +
                        ", author='" + author + '\'' +
                        ", numOfStars=" + numOfStars +
                        '}';
            }
            return msg ;
        }
}
