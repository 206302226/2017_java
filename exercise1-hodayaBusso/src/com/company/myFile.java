package com.company;

import java.io.File;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/28/2017.
 */
public class myFile  {

   private File file;


    public myFile(String path) {
        this.file = new File(path);
    }



    public void checkfile()
    {
        if(!file.exists())
        {
            throw  new InvalidParameterException("file not exist");

        }

    }
}
