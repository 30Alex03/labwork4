package com.mycompany.labwork4;

import java.io.File;
import java.util.ArrayList;

public interface Reader {
    ArrayList<ReactorType> read(File file);
}
