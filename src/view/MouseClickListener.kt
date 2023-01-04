package view

import model.Campo
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class MouseClickListener(
    private val campo: Campo,
    private val onBotaoEsquerdo: (Campo) -> Unit,
    private val onbBotaoDireito: (Campo) -> Unit
) : MouseListener{
    override fun mousePressed(e: MouseEvent?) {
        when (e?.button) {
            MouseEvent.BUTTON1 -> onBotaoEsquerdo(campo)
            MouseEvent.BUTTON2 -> onbBotaoDireito(campo)
        }
    }

    override fun mouseClicked(e: MouseEvent?) {}

    override fun mouseExited(e: MouseEvent?) {}

    override fun mouseEntered(e: MouseEvent?) {}

    override fun mouseReleased(e: MouseEvent?) {}
}