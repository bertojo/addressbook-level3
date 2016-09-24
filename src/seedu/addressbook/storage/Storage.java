package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;


public interface Storage {

    /**
     * loads the address book data
     * @return
     * @throws StorageOperationException
     */
    public AddressBook load() throws StorageOperationException;

    /**
     * 
     * @return path of file
     */
    public String getPath();

    /**
     * saves address book in storage
     * @param addressBook
     * @throws StorageOperationException
     */
    public void save(AddressBook addressBook) throws StorageOperationException;

}