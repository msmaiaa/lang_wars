import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object User: Table<Nothing>("user") {
    val id = int("id").primaryKey()
    val username = varchar("username")
    val password = varchar("password")
}