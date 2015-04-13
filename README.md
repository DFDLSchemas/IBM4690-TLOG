IBM4690-TLOG
============

This GitHub repository holds DFDL schemas that model Transaction Log (Tlog) data emitted by Toshiba Commerce Solutions (formerly IBM) 4690 point-of-sale devices. 
There are DFDL schemas for the following Tlog variations:

    ACE - SurePos ACE v7r5 and earlier
    SA - Supermarket Application

To download the repository go to http://dfdlschemas.github.com/IBM4690-TLOG/.

----------------
4690 Tlog messages consist of a number of transactions, each of which comprises one or more transaction records (or 'strings').
Each transaction starts with x22 and ends with x22x0Dx0A. Transaction records are separated by x22x2Cx22.
Within a transaction record, each field is typically separated by x3A, though some use x22x3Ax22.
Fields are either ASCII text, hex binary or a BCD variant specific to 4690 point-of-sale devices, and are fixed or variable length.
There are many different types of transaction record, and the first field identifies the type.
Some of the record types have sub-types which are identified by a subsequent field or fields.

For performance, the record type field is treated as an initiator. Record sub-types are identified using a discriminator on the appropriate field(s).

4690 Tlogs are invariably customized by each retailer. To allow for this, a customization schema has been supplied
which contains places where new record types or sub-types can be added. Additionally each record type allows extra fields at the end.
Any unrecognized records will be parsed with an 'XX' suffix added to the name, so it is easy to search the infoset after a parse. 

The DFDL schemas for 4690 Tlog are in the 'ACE' and 'SA' folders.

Test data and infosets are included.

The DFDL schemas are compatible with IBM DFDL 1.0 and 1.1 releases, as shipped in IBM WebSphere Message Broker 8.0.0.2
onwards and IBM Integration Bus 9.0.0.1 onwards, respectively.

The ACE schemas do not have a target namespace. The SA schemas have a target namespace. 

----------------
IBM WebSphere Message Broker and IBM Integration Bus

It is recommended that the ACE and SA folders are imported into separate library projects.

----------------
Please observe the copyright notice within each schema.

