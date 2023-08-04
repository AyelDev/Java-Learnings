package com.dataParsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.dataParsing.JobService.Job;

public class JobsFilteringApplication {

    public static void main(String[] args) {
        BufferedReader fileRead = null;

        try {
            fileRead = new BufferedReader(new FileReader("jobs.txt"));
            processJobs(fileRead);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileRead != null) {
                    fileRead.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processJobs(BufferedReader fileRead) {
        String line;
        try {
            while ((line = fileRead.readLine()) != null) {
                String[] jobsArray = line.split("\",\"");
                String title = jobsArray[0].replaceAll("\"", "");
                String company = jobsArray[1].replaceAll("\"", "");
                String compensation = jobsArray[2].replaceAll("\"", "");

                if (!title.isEmpty() && !company.isEmpty() && !compensation.isEmpty()) {
                    Job job = new JobService.Job(company, compensation, title);
                    System.out.println(job.getTitle());
                    System.out.println(job.getCompany());
                    System.out.println(job.getCompensation());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
