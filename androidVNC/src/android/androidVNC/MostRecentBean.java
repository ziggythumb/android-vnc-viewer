// This class was generated from android.androidVNC.IMostRecentBean by a tool
// Do not edit this file directly
package android.androidVNC;

public class MostRecentBean extends com.antlersoft.android.dbimpl.IdImplementationBase implements IMostRecentBean {

    public static final String GEN_TABLE_NAME = "MOST_RECENT";
    public static final int GEN_COUNT = 2;

    // Field constants
    public static final String GEN_FIELD__ID = "_ID";
    public static final int GEN_ID__ID = 0;
    public static final String GEN_FIELD_CONNECTION_ID = "CONNECTION_ID";
    public static final int GEN_ID_CONNECTION_ID = 1;

    // SQL Command for creating the table
    public static String GEN_CREATE = "CREATE TABLE MOST_RECENT (" +
    "_ID INTEGER PRIMARY KEY AUTOINCREMENT," +
    "CONNECTION_ID INTEGER" +
    ")";

    // Members corresponding to defined fields
    private long gen__Id;
    private long gen_CONNECTION_ID;


    public static final com.antlersoft.android.dbimpl.NewInstance<MostRecentBean> GEN_NEW = new com.antlersoft.android.dbimpl.NewInstance<MostRecentBean>() {
        public MostRecentBean get() {
            return new MostRecentBean();
        }
    }
    ;
    public String Gen_tableName() { return GEN_TABLE_NAME; }

    // Field accessors
    public long get_Id() { return gen__Id; }
    public void set_Id(long arg__Id) { gen__Id = arg__Id; }
    public long getConnectionId() { return gen_CONNECTION_ID; }
    public void setConnectionId(long arg_CONNECTION_ID) { gen_CONNECTION_ID = arg_CONNECTION_ID; }

    public android.content.ContentValues Gen_getValues() {
        android.content.ContentValues values=new android.content.ContentValues();
        values.put(GEN_FIELD__ID,Long.toString(this.gen__Id));
        values.put(GEN_FIELD_CONNECTION_ID,Long.toString(this.gen_CONNECTION_ID));
        return values;
    }

    /**
     * Return an array that gives the column index in the cursor for each field defined
     * @param cursor Database cursor over some columns, possibly including this table
     * @return array of column indices; -1 if the column with that id is not in cursor
     */
    public int[] Gen_columnIndices(android.database.Cursor cursor) {
        int[] result=new int[GEN_COUNT];
        result[0] = cursor.getColumnIndex(GEN_FIELD__ID);
        result[1] = cursor.getColumnIndex(GEN_FIELD_CONNECTION_ID);
        return result;
    }

    /**
     * Populate one instance from a cursor 
     */
    public void Gen_populate(android.database.Cursor cursor,int[] columnIndices) {
        if ( ! cursor.isNull(0)) {
            gen__Id = cursor.getLong(columnIndices[GEN_ID__ID]);
        }
        if ( ! cursor.isNull(1)) {
            gen_CONNECTION_ID = cursor.getLong(columnIndices[GEN_ID_CONNECTION_ID]);
        }
    }

    /**
     * Populate one instance from a ContentValues 
     */
    public void Gen_populate(android.content.ContentValues values) {
        gen__Id = values.getAsLong(GEN_FIELD__ID);
        gen_CONNECTION_ID = values.getAsLong(GEN_FIELD_CONNECTION_ID);
    }
}
