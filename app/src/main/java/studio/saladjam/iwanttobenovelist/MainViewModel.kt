package studio.saladjam.iwanttobenovelist

import android.graphics.Paint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import studio.saladjam.iwanttobenovelist.repository.dataclass.Book
import studio.saladjam.iwanttobenovelist.repository.dataclass.Chapter
import studio.saladjam.iwanttobenovelist.repository.loadingstatus.ApiLoadingStatus

class MainViewModel: ViewModel() {

    enum class PROFILETABS(val value: Int) {
        DEFAULT(-1),
        FOLLOWS(0),
        WORKS(1)
    }

    /***
     * LIVE DATAs and Corresponding ACTIONS
     */

    val currentFragmentType = MutableLiveData<CurrentFragmentType>()

    /** NAVIGATE to LOGIN PAGE */
    private val _shouldNavigateToLoginPage = MutableLiveData<Boolean>()
    val shouldNavigateToLoginPage: LiveData<Boolean>
        get() = _shouldNavigateToLoginPage

    fun navigateToLoginPage() {
        _shouldNavigateToLoginPage.value = true
    }

    fun doneNavigateToLoginPage() {
        _shouldNavigateToLoginPage.value = null
    }

    /** NAVIGATE to HOME PAGE */
    private val _shouldNavigateToHomePage = MutableLiveData<Boolean>()
    val shouldNavigateToHomePage: LiveData<Boolean>
        get() = _shouldNavigateToHomePage

    fun navigateToHomePage() {
        _shouldNavigateToHomePage.value = true
    }

    fun doneNavigateToHomePage() {
        _shouldNavigateToHomePage.value = null
    }

    /** NAVIGATE to CATEGORY SCENE */
    private val _shouldNavigateToCategoryPage = MutableLiveData<Boolean>()
    val shouldNavigateToCategoryPage: LiveData<Boolean>
        get() = _shouldNavigateToCategoryPage

    fun navigateToCategory() {
        _shouldNavigateToCategoryPage.value = true
    }

    fun doneNavigateToCategory() {
        _shouldNavigateToCategoryPage.value = null
    }

    /** NAVIGATE to SEARCH SCENE */
    private val _shouldNavigateToSearchRecommend = MutableLiveData<Boolean>()
    val shouldNavigateToSearchRecommend: LiveData<Boolean>
        get() = _shouldNavigateToSearchRecommend

    fun navigateToSearchRecommend() {
        _shouldNavigateToSearchRecommend.value = true
    }

    fun doneNavigateToSearchRecommend() {
        _shouldNavigateToSearchRecommend.value = null
    }

    private val _shouldNavigateToSearchPopular = MutableLiveData<Boolean>()
    val shouldNavigateToSearchPopular: LiveData<Boolean>
        get() = _shouldNavigateToSearchPopular

    fun navigateToSearchPopular() {
        _shouldNavigateToSearchPopular.value = true
    }

    fun doneNavigateToSearchPopular() {
        _shouldNavigateToSearchPopular.value = null
    }

    /** NAVIGATE to PROFILE SCENE */
    private val _shouldNavigateToProfilePage = MutableLiveData<Int>()
    val shouldNavigateToProfilePage: LiveData<Int>
        get() = _shouldNavigateToProfilePage

    fun navigateToProfilePage(profileTab: PROFILETABS = PROFILETABS.FOLLOWS) {
        _shouldNavigateToProfilePage.value = profileTab.value
    }

    fun doneNavigateToProfilePage() {
        _shouldNavigateToProfilePage.value = null
    }

    /** NAVIGATE to BOOK DETAIL --- DIVIDED into WRITER and READER VERSION */
    // WRITER
    private val _selectBookToEdit = MutableLiveData<Book>()
    val selectBookToEdit: LiveData<Book>
        get() = _selectBookToEdit

    fun selectedBookToEdit(book: Book) {
        _selectBookToEdit.value = book
    }

    fun doneDisplayingEditingBook() {
        _selectBookToEdit.value = null
    }

    /** NAVIGATE to EDITOR with CHAPTER */
    private val _selectedChapterForEditing = MutableLiveData<Chapter>()
    val selectedChapterForEditing: LiveData<Chapter>
        get() = _selectedChapterForEditing

    fun selectChapterToEdit(chapter: Chapter) {
        _selectedChapterForEditing.value = chapter
    }

    fun doneNavigateToEditor() {
        _selectedChapterForEditing.value = null
    }

    /** READER NAVIGATION */
    /** NAVIGATE TO BOOK */
    private val _selectedBookToRead = MutableLiveData<Book>()
    val selectedBookToRead: LiveData<Book>
        get() = _selectedBookToRead

    fun selectedBookToRead(book: Book) {
        _selectedBookToRead.value = book
    }

    fun doneDisplayingReadingBook() {
        _selectedBookToRead.value = null
    }

    /** NAVIGATE TO CHAPTER */
    private val _selectedChapterToRead = MutableLiveData<Pair<Book, Chapter>>()
    val selectedChapterToRead: LiveData<Pair<Book, Chapter>>
        get() = _selectedChapterToRead

    fun selectChpaterToReadInBook(pair: Pair<Book, Chapter>) {
        _selectedChapterToRead.value = pair
    }

    fun doneSelectChapterToRead() {
        _selectedChapterToRead.value = null
    }


    /** NAVIGATE to BOOK MANAGER */
    private val _selectedBookToManage = MutableLiveData<Book>()
    val selectedBookToManage: LiveData<Book>
        get() = _selectedBookToManage

    fun selectBookToManage(book: Book) {
        _selectedBookToManage.value = book
    }

    fun doneSelectBookToManage() {
        _selectedBookToManage.value = null
    }

    /** DISPLAY MESSAGE DIALOG */
    private val _dialogInfo = MutableLiveData<Pair<String, ApiLoadingStatus>>()
    val dialogInfo: LiveData<Pair<String, ApiLoadingStatus>>
        get() = _dialogInfo

    fun displayLoadingDialog(message: String, status: ApiLoadingStatus) {
        _dialogInfo.value = Pair(message, status)
    }

    fun doneReceivingDialogInfo() {
        _dialogInfo.value = null
    }

    private val _shouldDisplaySimpleTextScene = MutableLiveData<Boolean>()
    val shouldDisplaySimpleTextScene: LiveData<Boolean>
        get() = _shouldDisplaySimpleTextScene

    fun displaySimpleTextScene() {
        _shouldDisplaySimpleTextScene.value = true
    }

    fun doneDisplayingSimpleTextScene() {
        _shouldDisplaySimpleTextScene.value = null
    }




}