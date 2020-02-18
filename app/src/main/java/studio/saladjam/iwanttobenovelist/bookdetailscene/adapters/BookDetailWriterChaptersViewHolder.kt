package studio.saladjam.iwanttobenovelist.bookdetailscene.adapters

import androidx.recyclerview.widget.RecyclerView
import studio.saladjam.iwanttobenovelist.databinding.ItemBookChapterBinding
import studio.saladjam.iwanttobenovelist.repository.dataclass.Chapter

class BookDetailWriterChaptersViewHolder (val binding: ItemBookChapterBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(chapter: Chapter) {
        binding.chapter = chapter


        binding.executePendingBindings()
    }
}