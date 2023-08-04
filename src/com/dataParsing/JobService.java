package com.dataParsing;

public class JobService {

    public static class Job {
        private String company;
        private String compensation;
        private String title;

        public Job(String company, String compensation, String title) {
            this.company = company;
            this.compensation = compensation;
            this.title = title;
        }

        // Getter and setter methods for the properties
        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCompensation() {
            return compensation;
        }

        public void setCompensation(String compensation) {
            this.compensation = compensation;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

}
