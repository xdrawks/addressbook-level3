package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Represents a dummy file used for LogicTest.
 */
public class StorageStub implements Storage {
    
    //Keep a shadow copy of the address book.
    private AddressBook addressBook;
    
    /**
     * Constructs a StorageStub with a reference to the address book that the implementing class uses.
     */
    public StorageStub (AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        //Does nothing
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

}
