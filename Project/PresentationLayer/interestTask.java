/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.TimerTask;
//import LogicLayer.HashTable;

/**
 *
 * @author Michio
 */
public class interestTask extends TimerTask {
    @Override
    public void run(){
        
        //interest depends on the updating of thisMonthsDailyTotals field, so 
        //invoke method to update thisMonthsDailyTotals to get it ready for interest tasks
        GUI.MasterTable.updateAverageBalance();
        System.out.println("MSG interestTask.java: calling InterestAndPenalties");
        GUI.MasterTable.InterestAndPenalties();
        System.out.println("MSG interestTask.java: done with interest");
        
        
        
        /*System.out.println("task running, calculate # threads\n");
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        int peakThreadCount = bean.getPeakThreadCount();
        System.out.println("Peak Thread Count: " + peakThreadCount);
        System.out.println("Number of active threads from the given thread: " + Thread.activeCount());*/
        
        
        
        
    }
    
}