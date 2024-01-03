package devandroid.sodre.app_lista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.sodre.app_lista.R;
import devandroid.sodre.app_lista.model.Curso;
import devandroid.sodre.app_lista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; //Instanciando a classe Pessoa e definindo o objeto em seguida.
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa(); //Criando o objeto.

        outraPessoa = new Pessoa(); //Criando outra pessoa dentro da classe pessoa

        outraPessoa.setFirstName("Mary");
        outraPessoa.setSurname("Doe");
        outraPessoa.setDesiredCourse("Portuguese");
        outraPessoa.setPhone("(69) 53123-3901");

        pessoa.setFirstName("John"); //Definindo um atributo para o objeto de acordo
        //com seu template.
        pessoa.setSurname("Doe");
        pessoa.setDesiredCourse("English");
        pessoa.setPhone("(69) 55123-2123");

        dadosPessoa = "First name: " + pessoa.getFirstName() + "\nSurname: "
        + pessoa.getSurname() + "\nDesired Course: " + pessoa.getDesiredCourse() + "\nPhone: " +
                pessoa.getPhone();

        int parada = 0;


    }
}