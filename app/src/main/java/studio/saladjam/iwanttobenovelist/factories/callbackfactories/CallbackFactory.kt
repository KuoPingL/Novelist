package studio.saladjam.iwanttobenovelist.factories.callbackfactories

import androidx.recyclerview.widget.DiffUtil
import studio.saladjam.iwanttobenovelist.homescene.sealitems.HomeSealItems
import studio.saladjam.iwanttobenovelist.repository.dataclass.Book
import studio.saladjam.iwanttobenovelist.repository.dataclass.Genre
import studio.saladjam.iwanttobenovelist.repository.dataclass.User

@Suppress("UNCHECKED_CAST")
class CallbackFactory : DiffItemCallbackFactoryInterface {

    override fun <T : DiffUtil.ItemCallback<R>?, R:Any> create(modelClass: Class<R>): T {
        return with(modelClass) {
            when {
                isAssignableFrom(Genre::class.java) -> GenreCallback()
                isAssignableFrom(String::class.java) -> StringCallback()
                isAssignableFrom(Book::class.java) -> BookCallback()
                isAssignableFrom(HomeSealItems::class.java) -> HomeSealItemCallback()
                else -> IllegalArgumentException("UNKNOWN CLASS")
            }
        } as T
    }
}