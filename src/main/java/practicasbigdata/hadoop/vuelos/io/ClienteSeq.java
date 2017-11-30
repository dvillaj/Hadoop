// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 29 12:20:08 CET 2017
// For connector: org.apache.sqoop.manager.GenericJdbcManager
package practicasbigdata.hadoop.vuelos.io;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClienteSeq extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String NIF;
  public String get_NIF() {
    return NIF;
  }
  public void set_NIF(String NIF) {
    this.NIF = NIF;
  }
  public ClienteSeq with_NIF(String NIF) {
    this.NIF = NIF;
    return this;
  }
  private String NOMBRE;
  public String get_NOMBRE() {
    return NOMBRE;
  }
  public void set_NOMBRE(String NOMBRE) {
    this.NOMBRE = NOMBRE;
  }
  public ClienteSeq with_NOMBRE(String NOMBRE) {
    this.NOMBRE = NOMBRE;
    return this;
  }
  private String APELLIDOS;
  public String get_APELLIDOS() {
    return APELLIDOS;
  }
  public void set_APELLIDOS(String APELLIDOS) {
    this.APELLIDOS = APELLIDOS;
  }
  public ClienteSeq with_APELLIDOS(String APELLIDOS) {
    this.APELLIDOS = APELLIDOS;
    return this;
  }
  private String DOMICILIO;
  public String get_DOMICILIO() {
    return DOMICILIO;
  }
  public void set_DOMICILIO(String DOMICILIO) {
    this.DOMICILIO = DOMICILIO;
  }
  public ClienteSeq with_DOMICILIO(String DOMICILIO) {
    this.DOMICILIO = DOMICILIO;
    return this;
  }
  private Integer CP;
  public Integer get_CP() {
    return CP;
  }
  public void set_CP(Integer CP) {
    this.CP = CP;
  }
  public ClienteSeq with_CP(Integer CP) {
    this.CP = CP;
    return this;
  }
  private String CIUDAD;
  public String get_CIUDAD() {
    return CIUDAD;
  }
  public void set_CIUDAD(String CIUDAD) {
    this.CIUDAD = CIUDAD;
  }
  public ClienteSeq with_CIUDAD(String CIUDAD) {
    this.CIUDAD = CIUDAD;
    return this;
  }
  private String PROVINCIA;
  public String get_PROVINCIA() {
    return PROVINCIA;
  }
  public void set_PROVINCIA(String PROVINCIA) {
    this.PROVINCIA = PROVINCIA;
  }
  public ClienteSeq with_PROVINCIA(String PROVINCIA) {
    this.PROVINCIA = PROVINCIA;
    return this;
  }
  private Date FECHA_NACIMIENTO;
  public Date get_FECHA_NACIMIENTO() {
    return FECHA_NACIMIENTO;
  }
  public void set_FECHA_NACIMIENTO(Date FECHA_NACIMIENTO) {
    this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
  }
  public ClienteSeq with_FECHA_NACIMIENTO(Date FECHA_NACIMIENTO) {
    this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
    return this;
  }
  private Timestamp FECHA_ALTA;
  public Timestamp get_FECHA_ALTA() {
    return FECHA_ALTA;
  }
  public void set_FECHA_ALTA(Timestamp FECHA_ALTA) {
    this.FECHA_ALTA = FECHA_ALTA;
  }
  public ClienteSeq with_FECHA_ALTA(Timestamp FECHA_ALTA) {
    this.FECHA_ALTA = FECHA_ALTA;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ClienteSeq)) {
      return false;
    }
    ClienteSeq that = (ClienteSeq) o;
    boolean equal = true;
    equal = equal && (this.NIF == null ? that.NIF == null : this.NIF.equals(that.NIF));
    equal = equal && (this.NOMBRE == null ? that.NOMBRE == null : this.NOMBRE.equals(that.NOMBRE));
    equal = equal && (this.APELLIDOS == null ? that.APELLIDOS == null : this.APELLIDOS.equals(that.APELLIDOS));
    equal = equal && (this.DOMICILIO == null ? that.DOMICILIO == null : this.DOMICILIO.equals(that.DOMICILIO));
    equal = equal && (this.CP == null ? that.CP == null : this.CP.equals(that.CP));
    equal = equal && (this.CIUDAD == null ? that.CIUDAD == null : this.CIUDAD.equals(that.CIUDAD));
    equal = equal && (this.PROVINCIA == null ? that.PROVINCIA == null : this.PROVINCIA.equals(that.PROVINCIA));
    equal = equal && (this.FECHA_NACIMIENTO == null ? that.FECHA_NACIMIENTO == null : this.FECHA_NACIMIENTO.equals(that.FECHA_NACIMIENTO));
    equal = equal && (this.FECHA_ALTA == null ? that.FECHA_ALTA == null : this.FECHA_ALTA.equals(that.FECHA_ALTA));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ClienteSeq)) {
      return false;
    }
    ClienteSeq that = (ClienteSeq) o;
    boolean equal = true;
    equal = equal && (this.NIF == null ? that.NIF == null : this.NIF.equals(that.NIF));
    equal = equal && (this.NOMBRE == null ? that.NOMBRE == null : this.NOMBRE.equals(that.NOMBRE));
    equal = equal && (this.APELLIDOS == null ? that.APELLIDOS == null : this.APELLIDOS.equals(that.APELLIDOS));
    equal = equal && (this.DOMICILIO == null ? that.DOMICILIO == null : this.DOMICILIO.equals(that.DOMICILIO));
    equal = equal && (this.CP == null ? that.CP == null : this.CP.equals(that.CP));
    equal = equal && (this.CIUDAD == null ? that.CIUDAD == null : this.CIUDAD.equals(that.CIUDAD));
    equal = equal && (this.PROVINCIA == null ? that.PROVINCIA == null : this.PROVINCIA.equals(that.PROVINCIA));
    equal = equal && (this.FECHA_NACIMIENTO == null ? that.FECHA_NACIMIENTO == null : this.FECHA_NACIMIENTO.equals(that.FECHA_NACIMIENTO));
    equal = equal && (this.FECHA_ALTA == null ? that.FECHA_ALTA == null : this.FECHA_ALTA.equals(that.FECHA_ALTA));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.NIF = JdbcWritableBridge.readString(1, __dbResults);
    this.NOMBRE = JdbcWritableBridge.readString(2, __dbResults);
    this.APELLIDOS = JdbcWritableBridge.readString(3, __dbResults);
    this.DOMICILIO = JdbcWritableBridge.readString(4, __dbResults);
    this.CP = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CIUDAD = JdbcWritableBridge.readString(6, __dbResults);
    this.PROVINCIA = JdbcWritableBridge.readString(7, __dbResults);
    this.FECHA_NACIMIENTO = JdbcWritableBridge.readDate(8, __dbResults);
    this.FECHA_ALTA = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.NIF = JdbcWritableBridge.readString(1, __dbResults);
    this.NOMBRE = JdbcWritableBridge.readString(2, __dbResults);
    this.APELLIDOS = JdbcWritableBridge.readString(3, __dbResults);
    this.DOMICILIO = JdbcWritableBridge.readString(4, __dbResults);
    this.CP = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CIUDAD = JdbcWritableBridge.readString(6, __dbResults);
    this.PROVINCIA = JdbcWritableBridge.readString(7, __dbResults);
    this.FECHA_NACIMIENTO = JdbcWritableBridge.readDate(8, __dbResults);
    this.FECHA_ALTA = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(NIF, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NOMBRE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(APELLIDOS, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMICILIO, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CP, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CIUDAD, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROVINCIA, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(FECHA_NACIMIENTO, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FECHA_ALTA, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(NIF, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NOMBRE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(APELLIDOS, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOMICILIO, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(CP, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CIUDAD, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROVINCIA, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(FECHA_NACIMIENTO, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FECHA_ALTA, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.NIF = null;
    } else {
    this.NIF = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NOMBRE = null;
    } else {
    this.NOMBRE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.APELLIDOS = null;
    } else {
    this.APELLIDOS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOMICILIO = null;
    } else {
    this.DOMICILIO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CP = null;
    } else {
    this.CP = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CIUDAD = null;
    } else {
    this.CIUDAD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PROVINCIA = null;
    } else {
    this.PROVINCIA = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FECHA_NACIMIENTO = null;
    } else {
    this.FECHA_NACIMIENTO = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.FECHA_ALTA = null;
    } else {
    this.FECHA_ALTA = new Timestamp(__dataIn.readLong());
    this.FECHA_ALTA.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.NIF) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NIF);
    }
    if (null == this.NOMBRE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NOMBRE);
    }
    if (null == this.APELLIDOS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, APELLIDOS);
    }
    if (null == this.DOMICILIO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMICILIO);
    }
    if (null == this.CP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CP);
    }
    if (null == this.CIUDAD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIUDAD);
    }
    if (null == this.PROVINCIA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROVINCIA);
    }
    if (null == this.FECHA_NACIMIENTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FECHA_NACIMIENTO.getTime());
    }
    if (null == this.FECHA_ALTA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FECHA_ALTA.getTime());
    __dataOut.writeInt(this.FECHA_ALTA.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.NIF) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NIF);
    }
    if (null == this.NOMBRE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NOMBRE);
    }
    if (null == this.APELLIDOS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, APELLIDOS);
    }
    if (null == this.DOMICILIO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOMICILIO);
    }
    if (null == this.CP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CP);
    }
    if (null == this.CIUDAD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CIUDAD);
    }
    if (null == this.PROVINCIA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROVINCIA);
    }
    if (null == this.FECHA_NACIMIENTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FECHA_NACIMIENTO.getTime());
    }
    if (null == this.FECHA_ALTA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FECHA_ALTA.getTime());
    __dataOut.writeInt(this.FECHA_ALTA.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(NIF==null?"null":NIF, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOMBRE==null?"null":NOMBRE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(APELLIDOS==null?"null":APELLIDOS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMICILIO==null?"null":DOMICILIO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CP==null?"null":"" + CP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIUDAD==null?"null":CIUDAD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROVINCIA==null?"null":PROVINCIA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FECHA_NACIMIENTO==null?"null":"" + FECHA_NACIMIENTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FECHA_ALTA==null?"null":"" + FECHA_ALTA, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(NIF==null?"null":NIF, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NOMBRE==null?"null":NOMBRE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(APELLIDOS==null?"null":APELLIDOS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOMICILIO==null?"null":DOMICILIO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CP==null?"null":"" + CP, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CIUDAD==null?"null":CIUDAD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROVINCIA==null?"null":PROVINCIA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FECHA_NACIMIENTO==null?"null":"" + FECHA_NACIMIENTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FECHA_ALTA==null?"null":"" + FECHA_ALTA, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NIF = null; } else {
      this.NIF = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NOMBRE = null; } else {
      this.NOMBRE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.APELLIDOS = null; } else {
      this.APELLIDOS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DOMICILIO = null; } else {
      this.DOMICILIO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CP = null; } else {
      this.CP = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIUDAD = null; } else {
      this.CIUDAD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROVINCIA = null; } else {
      this.PROVINCIA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FECHA_NACIMIENTO = null; } else {
      this.FECHA_NACIMIENTO = Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FECHA_ALTA = null; } else {
      this.FECHA_ALTA = Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NIF = null; } else {
      this.NIF = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NOMBRE = null; } else {
      this.NOMBRE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.APELLIDOS = null; } else {
      this.APELLIDOS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DOMICILIO = null; } else {
      this.DOMICILIO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CP = null; } else {
      this.CP = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CIUDAD = null; } else {
      this.CIUDAD = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROVINCIA = null; } else {
      this.PROVINCIA = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FECHA_NACIMIENTO = null; } else {
      this.FECHA_NACIMIENTO = Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FECHA_ALTA = null; } else {
      this.FECHA_ALTA = Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ClienteSeq o = (ClienteSeq) super.clone();
    o.FECHA_NACIMIENTO = (o.FECHA_NACIMIENTO != null) ? (Date) o.FECHA_NACIMIENTO.clone() : null;
    o.FECHA_ALTA = (o.FECHA_ALTA != null) ? (Timestamp) o.FECHA_ALTA.clone() : null;
    return o;
  }

  public void clone0(ClienteSeq o) throws CloneNotSupportedException {
    o.FECHA_NACIMIENTO = (o.FECHA_NACIMIENTO != null) ? (Date) o.FECHA_NACIMIENTO.clone() : null;
    o.FECHA_ALTA = (o.FECHA_ALTA != null) ? (Timestamp) o.FECHA_ALTA.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("NIF", this.NIF);
    __sqoop$field_map.put("NOMBRE", this.NOMBRE);
    __sqoop$field_map.put("APELLIDOS", this.APELLIDOS);
    __sqoop$field_map.put("DOMICILIO", this.DOMICILIO);
    __sqoop$field_map.put("CP", this.CP);
    __sqoop$field_map.put("CIUDAD", this.CIUDAD);
    __sqoop$field_map.put("PROVINCIA", this.PROVINCIA);
    __sqoop$field_map.put("FECHA_NACIMIENTO", this.FECHA_NACIMIENTO);
    __sqoop$field_map.put("FECHA_ALTA", this.FECHA_ALTA);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("NIF", this.NIF);
    __sqoop$field_map.put("NOMBRE", this.NOMBRE);
    __sqoop$field_map.put("APELLIDOS", this.APELLIDOS);
    __sqoop$field_map.put("DOMICILIO", this.DOMICILIO);
    __sqoop$field_map.put("CP", this.CP);
    __sqoop$field_map.put("CIUDAD", this.CIUDAD);
    __sqoop$field_map.put("PROVINCIA", this.PROVINCIA);
    __sqoop$field_map.put("FECHA_NACIMIENTO", this.FECHA_NACIMIENTO);
    __sqoop$field_map.put("FECHA_ALTA", this.FECHA_ALTA);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("NIF".equals(__fieldName)) {
      this.NIF = (String) __fieldVal;
    }
    else    if ("NOMBRE".equals(__fieldName)) {
      this.NOMBRE = (String) __fieldVal;
    }
    else    if ("APELLIDOS".equals(__fieldName)) {
      this.APELLIDOS = (String) __fieldVal;
    }
    else    if ("DOMICILIO".equals(__fieldName)) {
      this.DOMICILIO = (String) __fieldVal;
    }
    else    if ("CP".equals(__fieldName)) {
      this.CP = (Integer) __fieldVal;
    }
    else    if ("CIUDAD".equals(__fieldName)) {
      this.CIUDAD = (String) __fieldVal;
    }
    else    if ("PROVINCIA".equals(__fieldName)) {
      this.PROVINCIA = (String) __fieldVal;
    }
    else    if ("FECHA_NACIMIENTO".equals(__fieldName)) {
      this.FECHA_NACIMIENTO = (Date) __fieldVal;
    }
    else    if ("FECHA_ALTA".equals(__fieldName)) {
      this.FECHA_ALTA = (Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("NIF".equals(__fieldName)) {
      this.NIF = (String) __fieldVal;
      return true;
    }
    else    if ("NOMBRE".equals(__fieldName)) {
      this.NOMBRE = (String) __fieldVal;
      return true;
    }
    else    if ("APELLIDOS".equals(__fieldName)) {
      this.APELLIDOS = (String) __fieldVal;
      return true;
    }
    else    if ("DOMICILIO".equals(__fieldName)) {
      this.DOMICILIO = (String) __fieldVal;
      return true;
    }
    else    if ("CP".equals(__fieldName)) {
      this.CP = (Integer) __fieldVal;
      return true;
    }
    else    if ("CIUDAD".equals(__fieldName)) {
      this.CIUDAD = (String) __fieldVal;
      return true;
    }
    else    if ("PROVINCIA".equals(__fieldName)) {
      this.PROVINCIA = (String) __fieldVal;
      return true;
    }
    else    if ("FECHA_NACIMIENTO".equals(__fieldName)) {
      this.FECHA_NACIMIENTO = (Date) __fieldVal;
      return true;
    }
    else    if ("FECHA_ALTA".equals(__fieldName)) {
      this.FECHA_ALTA = (Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
