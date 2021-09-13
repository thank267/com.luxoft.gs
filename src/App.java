import java.util.List;

import java.util.stream.LongStream;

import util.MemoryUtil;

import java.util.ArrayList;

import util.MemoryUtil;

public class App {
    
    public static List<Double> test = new ArrayList<>();
 
    public static void main(String[] args) throws Exception {
        
        MemoryUtil.startGCMonitor();

        while (true) {
            LongStream.range(0, 1000000).forEach(el -> test.add(Math.random()));
            System.out.println(test.size());
            MemoryUtil.printUsage(true);
            LongStream.range(0, 500000).forEach(el -> test.remove(0));
            System.out.println(test.size());
            MemoryUtil.printUsage(true);
        }

        
    }
}
