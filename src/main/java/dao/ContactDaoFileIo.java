package dao;

import entity.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface ContactDaoFileIo {

    void saveAllContactsToTxtFile() throws IOException;

    Set<Contact> loadAllContactsFromTxtFile(BufferedReader bufReader) throws FileNotFoundException;

    void saveAllContactsToDatFile() throws IOException;

    Set<Contact> loadAllContactsFromDatFile();
}