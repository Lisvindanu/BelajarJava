import java.awt.Desktop
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.io.IOException
import java.net.URI
import java.net.URISyntaxException
import javax.swing.*

fun main() {
    val frame = JFrame("Cek Umur GUI")

    val nameLabel = JLabel("Nama:")
    val nameField = JTextField(20)

    val umurLabel = JLabel("Umur:")
    val umurField = JTextField(5)

    val submitButton = JButton("Submit")

    val resultArea = JTextArea(5, 20)
    resultArea.isEditable = false

    submitButton.addActionListener { e: ActionEvent ->
        val nama = nameField.text
        val umur = umurField.text.toInt()
        val hasil = if (umur < 18) "Cih bocil" else "Anjay gede"
        resultArea.text = "Nama: $nama\nUmur: $umur\nRostingGwe: $hasil"

        // Tampilkan video Rickroll dari menit 1:43 di browser default setelah 5 detik
        val timer = Timer(500) {
            try {
                Desktop.getDesktop().browse(URI("https://www.youtube.com/watch?v=bHXn-SU7YYg"))
            } catch (ex: IOException) {
                ex.printStackTrace()
            } catch (ex: URISyntaxException) {
                ex.printStackTrace()
            }
        }
        timer.isRepeats = false // Hanya dijalankan sekali setelah 5 detik
        timer.start() // Mulai hitung waktu
    }

    val panel = JPanel()
    panel.add(nameLabel)
    panel.add(nameField)
    panel.add(umurLabel)
    panel.add(umurField)
    panel.add(submitButton)
    panel.add(resultArea)

    frame.add(panel)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(300, 200)
    frame.isVisible = true
}
