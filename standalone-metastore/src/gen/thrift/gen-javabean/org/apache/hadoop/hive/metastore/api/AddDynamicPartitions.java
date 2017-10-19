/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class AddDynamicPartitions implements org.apache.thrift.TBase<AddDynamicPartitions, AddDynamicPartitions._Fields>, java.io.Serializable, Cloneable, Comparable<AddDynamicPartitions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddDynamicPartitions");

  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARTITIONNAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionnames", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField OPERATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("operationType", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddDynamicPartitionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddDynamicPartitionsTupleSchemeFactory());
  }

  private long txnid; // required
  private String dbname; // required
  private String tablename; // required
  private List<String> partitionnames; // required
  private DataOperationType operationType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXNID((short)1, "txnid"),
    DBNAME((short)2, "dbname"),
    TABLENAME((short)3, "tablename"),
    PARTITIONNAMES((short)4, "partitionnames"),
    /**
     * 
     * @see DataOperationType
     */
    OPERATION_TYPE((short)5, "operationType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TXNID
          return TXNID;
        case 2: // DBNAME
          return DBNAME;
        case 3: // TABLENAME
          return TABLENAME;
        case 4: // PARTITIONNAMES
          return PARTITIONNAMES;
        case 5: // OPERATION_TYPE
          return OPERATION_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXNID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPERATION_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAMES, new org.apache.thrift.meta_data.FieldMetaData("partitionnames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPERATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operationType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DataOperationType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddDynamicPartitions.class, metaDataMap);
  }

  public AddDynamicPartitions() {
    this.operationType = org.apache.hadoop.hive.metastore.api.DataOperationType.UNSET;

  }

  public AddDynamicPartitions(
    long txnid,
    String dbname,
    String tablename,
    List<String> partitionnames)
  {
    this();
    this.txnid = txnid;
    setTxnidIsSet(true);
    this.dbname = dbname;
    this.tablename = tablename;
    this.partitionnames = partitionnames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddDynamicPartitions(AddDynamicPartitions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnid = other.txnid;
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionnames()) {
      List<String> __this__partitionnames = new ArrayList<String>(other.partitionnames);
      this.partitionnames = __this__partitionnames;
    }
    if (other.isSetOperationType()) {
      this.operationType = other.operationType;
    }
  }

  public AddDynamicPartitions deepCopy() {
    return new AddDynamicPartitions(this);
  }

  @Override
  public void clear() {
    setTxnidIsSet(false);
    this.txnid = 0;
    this.dbname = null;
    this.tablename = null;
    this.partitionnames = null;
    this.operationType = org.apache.hadoop.hive.metastore.api.DataOperationType.UNSET;

  }

  public long getTxnid() {
    return this.txnid;
  }

  public void setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  public void unsetTxnid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public String getDbname() {
    return this.dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  public String getTablename() {
    return this.tablename;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  public int getPartitionnamesSize() {
    return (this.partitionnames == null) ? 0 : this.partitionnames.size();
  }

  public java.util.Iterator<String> getPartitionnamesIterator() {
    return (this.partitionnames == null) ? null : this.partitionnames.iterator();
  }

  public void addToPartitionnames(String elem) {
    if (this.partitionnames == null) {
      this.partitionnames = new ArrayList<String>();
    }
    this.partitionnames.add(elem);
  }

  public List<String> getPartitionnames() {
    return this.partitionnames;
  }

  public void setPartitionnames(List<String> partitionnames) {
    this.partitionnames = partitionnames;
  }

  public void unsetPartitionnames() {
    this.partitionnames = null;
  }

  /** Returns true if field partitionnames is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionnames() {
    return this.partitionnames != null;
  }

  public void setPartitionnamesIsSet(boolean value) {
    if (!value) {
      this.partitionnames = null;
    }
  }

  /**
   * 
   * @see DataOperationType
   */
  public DataOperationType getOperationType() {
    return this.operationType;
  }

  /**
   * 
   * @see DataOperationType
   */
  public void setOperationType(DataOperationType operationType) {
    this.operationType = operationType;
  }

  public void unsetOperationType() {
    this.operationType = null;
  }

  /** Returns true if field operationType is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationType() {
    return this.operationType != null;
  }

  public void setOperationTypeIsSet(boolean value) {
    if (!value) {
      this.operationType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((Long)value);
      }
      break;

    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((String)value);
      }
      break;

    case PARTITIONNAMES:
      if (value == null) {
        unsetPartitionnames();
      } else {
        setPartitionnames((List<String>)value);
      }
      break;

    case OPERATION_TYPE:
      if (value == null) {
        unsetOperationType();
      } else {
        setOperationType((DataOperationType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TXNID:
      return getTxnid();

    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAMES:
      return getPartitionnames();

    case OPERATION_TYPE:
      return getOperationType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TXNID:
      return isSetTxnid();
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAMES:
      return isSetPartitionnames();
    case OPERATION_TYPE:
      return isSetOperationType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddDynamicPartitions)
      return this.equals((AddDynamicPartitions)that);
    return false;
  }

  public boolean equals(AddDynamicPartitions that) {
    if (that == null)
      return false;

    boolean this_present_txnid = true;
    boolean that_present_txnid = true;
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionnames = true && this.isSetPartitionnames();
    boolean that_present_partitionnames = true && that.isSetPartitionnames();
    if (this_present_partitionnames || that_present_partitionnames) {
      if (!(this_present_partitionnames && that_present_partitionnames))
        return false;
      if (!this.partitionnames.equals(that.partitionnames))
        return false;
    }

    boolean this_present_operationType = true && this.isSetOperationType();
    boolean that_present_operationType = true && that.isSetOperationType();
    if (this_present_operationType || that_present_operationType) {
      if (!(this_present_operationType && that_present_operationType))
        return false;
      if (!this.operationType.equals(that.operationType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_txnid = true;
    list.add(present_txnid);
    if (present_txnid)
      list.add(txnid);

    boolean present_dbname = true && (isSetDbname());
    list.add(present_dbname);
    if (present_dbname)
      list.add(dbname);

    boolean present_tablename = true && (isSetTablename());
    list.add(present_tablename);
    if (present_tablename)
      list.add(tablename);

    boolean present_partitionnames = true && (isSetPartitionnames());
    list.add(present_partitionnames);
    if (present_partitionnames)
      list.add(partitionnames);

    boolean present_operationType = true && (isSetOperationType());
    list.add(present_operationType);
    if (present_operationType)
      list.add(operationType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(AddDynamicPartitions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTxnid()).compareTo(other.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, other.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbname()).compareTo(other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTablename()).compareTo(other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionnames()).compareTo(other.isSetPartitionnames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionnames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionnames, other.partitionnames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperationType()).compareTo(other.isSetOperationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationType, other.operationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AddDynamicPartitions(");
    boolean first = true;

    sb.append("txnid:");
    sb.append(this.txnid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbname:");
    if (this.dbname == null) {
      sb.append("null");
    } else {
      sb.append(this.dbname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablename:");
    if (this.tablename == null) {
      sb.append("null");
    } else {
      sb.append(this.tablename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitionnames:");
    if (this.partitionnames == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionnames);
    }
    first = false;
    if (isSetOperationType()) {
      if (!first) sb.append(", ");
      sb.append("operationType:");
      if (this.operationType == null) {
        sb.append("null");
      } else {
        sb.append(this.operationType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnid()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnid' is unset! Struct:" + toString());
    }

    if (!isSetDbname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbname' is unset! Struct:" + toString());
    }

    if (!isSetTablename()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablename' is unset! Struct:" + toString());
    }

    if (!isSetPartitionnames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitionnames' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddDynamicPartitionsStandardSchemeFactory implements SchemeFactory {
    public AddDynamicPartitionsStandardScheme getScheme() {
      return new AddDynamicPartitionsStandardScheme();
    }
  }

  private static class AddDynamicPartitionsStandardScheme extends StandardScheme<AddDynamicPartitions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARTITIONNAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list606 = iprot.readListBegin();
                struct.partitionnames = new ArrayList<String>(_list606.size);
                String _elem607;
                for (int _i608 = 0; _i608 < _list606.size; ++_i608)
                {
                  _elem607 = iprot.readString();
                  struct.partitionnames.add(_elem607);
                }
                iprot.readListEnd();
              }
              struct.setPartitionnamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OPERATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operationType = org.apache.hadoop.hive.metastore.api.DataOperationType.findByValue(iprot.readI32());
              struct.setOperationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXNID_FIELD_DESC);
      oprot.writeI64(struct.txnid);
      oprot.writeFieldEnd();
      if (struct.dbname != null) {
        oprot.writeFieldBegin(DBNAME_FIELD_DESC);
        oprot.writeString(struct.dbname);
        oprot.writeFieldEnd();
      }
      if (struct.tablename != null) {
        oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
        oprot.writeString(struct.tablename);
        oprot.writeFieldEnd();
      }
      if (struct.partitionnames != null) {
        oprot.writeFieldBegin(PARTITIONNAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partitionnames.size()));
          for (String _iter609 : struct.partitionnames)
          {
            oprot.writeString(_iter609);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.operationType != null) {
        if (struct.isSetOperationType()) {
          oprot.writeFieldBegin(OPERATION_TYPE_FIELD_DESC);
          oprot.writeI32(struct.operationType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddDynamicPartitionsTupleSchemeFactory implements SchemeFactory {
    public AddDynamicPartitionsTupleScheme getScheme() {
      return new AddDynamicPartitionsTupleScheme();
    }
  }

  private static class AddDynamicPartitionsTupleScheme extends TupleScheme<AddDynamicPartitions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.txnid);
      oprot.writeString(struct.dbname);
      oprot.writeString(struct.tablename);
      {
        oprot.writeI32(struct.partitionnames.size());
        for (String _iter610 : struct.partitionnames)
        {
          oprot.writeString(_iter610);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetOperationType()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOperationType()) {
        oprot.writeI32(struct.operationType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.txnid = iprot.readI64();
      struct.setTxnidIsSet(true);
      struct.dbname = iprot.readString();
      struct.setDbnameIsSet(true);
      struct.tablename = iprot.readString();
      struct.setTablenameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list611 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.partitionnames = new ArrayList<String>(_list611.size);
        String _elem612;
        for (int _i613 = 0; _i613 < _list611.size; ++_i613)
        {
          _elem612 = iprot.readString();
          struct.partitionnames.add(_elem612);
        }
      }
      struct.setPartitionnamesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.operationType = org.apache.hadoop.hive.metastore.api.DataOperationType.findByValue(iprot.readI32());
        struct.setOperationTypeIsSet(true);
      }
    }
  }

}
