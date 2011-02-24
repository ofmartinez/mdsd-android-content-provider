package de.mdsdacp.logic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import de.mdsdacp.workflow.config.ACPWorkflowConfig;

public class Counter {
	private final static boolean DEBUG = false;
	
    public static Integer countUp() {
    	String genPath = ACPWorkflowConfig.getInstance().getGenPath();
    	if(DEBUG){
    		if(genPath==null){
        		genPath = "src-gen";
        	}	
    	}
    	
        File file = new File(genPath+"/gen.properties");
        Integer count = 0;
        if (file.exists()) {
            count = getCount();
        }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("gen-count=" + ++count);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static Integer getCount() {
    	String genPath = ACPWorkflowConfig.getInstance().getGenPath();
    	if(DEBUG){
        	if(genPath==null){
        		genPath = "src-gen";
        	}    		
    	}

        File file = new File(genPath+"/gen.properties");
        Integer count = 0;
        if (file.exists()) {
            String countVal = "";
            try {
                FileReader fr = new FileReader(file);
                int read = fr.read();
                while (read != -1) {
                    countVal += (char) read;
                    read = fr.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
            return Integer.parseInt(countVal.replace("gen-count=", ""));
        } else {
            return count;
        }
    }
}
