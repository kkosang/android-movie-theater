package woowacourse.movie.presentation.view.navigation

import androidx.recyclerview.widget.RecyclerView
import woowacourse.movie.databinding.ReservationItemBinding
import woowacourse.movie.presentation.uimodel.TicketUiModel

class ReservationViewHolder(
    private val binding: ReservationItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(
        ticket: TicketUiModel,
        clickListener: ReservationListContract.ItemListener
    ) {
        binding.ticket = ticket
        binding.listener = clickListener
    }
}
