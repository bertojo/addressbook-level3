package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub implements Storage {

    public StorageStub(String storageFilePath) {
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return new AddressBook();
    }

    @Override
    public void save(AddressBook book) throws StorageOperationException {
    }

    @Override
    public String getPath() {
        return null;
    }

}