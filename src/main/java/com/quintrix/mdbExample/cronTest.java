package com.quintrix.mdbExample;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class cronTest {

  @Scheduled(cron = "1 * * * * *")
  public void cron() {
    System.out.println("cron tested");
  }

}
