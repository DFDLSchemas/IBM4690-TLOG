IBM4690-TLOG
============

DFDL schemas for Transaction Log data emitted by Toshiba Commerce Solutions (formerly IBM) 4690 point-of-sale devices. There are DFDL schemas for:

    ACE - SurePos ACE v7r4 and earlier
    GSA - General Sales Application (coming soon)
    SA - Supermarket Application (coming soon)

More details at the repository web page http://dfdlschemas.github.com/IBM4690-TLOG/.

To download the repository go to http://dfdlschemas.github.com/IBM4690-TLOG/.

TlogAceFormat.xsd 
-----------------
A DFDL schema that contains default values for DFDL properties that are suitable for ACE data.

TlogAceTypes.xsd
----------------
A DFDL schema that contains DFDL-annotated data types for all the main types defined by the ACE programming reference.

TlogAce.xsd
-----------
A DFDL schema providing a model for all ACE transaction records defined in the ACE programming reference. Releases up to and including v7r3 are supported.

TlogACECommon.xsd
--------------
A DFDL schema that contains common structures used in ACE transaction records.

TlogACECustom.xsd
--------------
A DFDL schema that allows the definition of custom ACE transaction records, such as extra 99 and 20 records.


The DFDL schemas are compatible with IBM DFDL 1.0 and 1.1 releases, as shipped in IBM WebSphere Message Broker 8.0.0.2 onwards and IBM Integration Bus 9.0.0.1 onwards, respectively.

----------------
Please observe the copyright notice within each schema.

