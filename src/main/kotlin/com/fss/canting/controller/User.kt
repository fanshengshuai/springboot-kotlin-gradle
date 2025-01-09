import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user_data")
data class User(
    @Id val _id: Int,
    val name: String,
    val age: Int? = 0
)
