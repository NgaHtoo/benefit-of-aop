package com.demo.repository;

import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportProvider {
   public Report reportProvide(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

            throw new RuntimeException();
        }
        System.out.println("Reporter provider provide.");

        return new Report();
    }
}
