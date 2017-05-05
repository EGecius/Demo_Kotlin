package c_Classes_and_Objects.j_Objects.j_a_annnonymous

/**
 * Shows how to do the equivalent of anonymous classes
 */
class AnonymousUsage(val client: Client) {

    var hasClicked : Boolean = false

    fun setListenerAndCallClick() {
        val listener: Listener = object : Listener {
            override fun onClick() {
                hasClicked = true;
            }
        }
        client.addListener(listener)
        listener.onClick()
    }

}
