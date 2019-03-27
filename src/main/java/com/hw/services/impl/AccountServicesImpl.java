package com.hw.services.impl;

import com.hw.biz.model.AccountTallyDO;
import com.hw.services.AccountServices;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class AccountServicesImpl implements AccountServices {
    @Override
    public void enterAccount(AccountTallyDO accountTallyDO) {

    }

    public static void main(String[] args) {
        try {
            AccountServicesImpl a = new AccountServicesImpl();
            /**
            File file = new File("/Users/lule/Desktop/vip1");
            if(file.isDirectory()) {
                File[] fileList = file.listFiles();
                for(File oneFile : fileList) {
                    System.out.println(oneFile.getPath());
                    a.filter(oneFile.getPath(), oneFile.getName());
                }
            }
            **/
            File file = new File("/Users/lule/Desktop/result");
            if(file.isDirectory()) {
                File[] fileList = file.listFiles();
                for(File oneFile : fileList) {
                    System.out.println(oneFile.getPath());
                    a.hebing(oneFile.getPath(), oneFile.getName());
                }
            }
        } catch(Exception e) {
            System.out.print(e);
        }
    }

    public void filter(String filePath, String fileName) {
        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            FileWriter writer = new FileWriter("/Users/lule/Desktop/result/" + fileName);
            BufferedWriter bw = new BufferedWriter(writer);
            String oneLine = null;
            while((oneLine = br.readLine()) != null) {
                String[] oneLineStrings = oneLine.split("\\s+");
                System.out.println(oneLineStrings[11] + "-" + oneLineStrings[12] + "-" + oneLineStrings[13]);
                if(oneLineStrings[11].indexOf("点卡")!= -1 || oneLineStrings[12].indexOf("点卡")!= -1 || oneLineStrings[13].indexOf("点卡")!= -1) {
                    bw.write(oneLine);
                }
            }
            br.close();
            reader.close();
            bw.close();
            writer.close();
        } catch(Exception e) {
            System.out.print(e);
        }
    }

    public void hebing(String filePath, String fileName) {
        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            FileWriter writer = new FileWriter("/Users/lule/Desktop/result/diankaresult");
            BufferedWriter bw = new BufferedWriter(writer);
            String oneLine = null;
            while((oneLine = br.readLine()) != null) {
                    bw.write(oneLine);
            }
            br.close();
            reader.close();
            bw.close();
            writer.close();
        } catch(Exception e) {
            System.out.print(e);
        }
    }

}
