import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.hive.ql.udf.UDFType;
/*
 * Here make sure that addition of annotation @UDFType(stateful = true) is required otherwise counter value will not get increment in the Hive column, it will just return value 1 for all the rows but not the actual row number.
 */
@UDFType(stateful = true, 	deterministic=false)
public class AutoIncrementUDF extends UDF
{
int ctr;
public int evaluate() {
return ctr++;
}
}
