package com.example.td5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity{
    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //Lokup the recyclerview in activity layout
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        // Initialisation des contacts
        contacts.add(new Contact("Jean","Pierre", "https://lesjours.fr/ressources/square/people/jean-pierre-pernaut.jpeg"));
        contacts.add(new Contact("Jeanne","D'Arc", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Pierre","Menez", "https://voi.img.pmdstatic.net/fit/https.3A.2F.2Fi.2Epmdstatic.2Enet.2Fvoi.2F2021.2F03.2F23.2F544f1135-be01-40b4-ab5c-6a0663712583.2Ejpeg/753x565/cr/wqkgQmVzdF9pbWFnZSAvIFZvaWNp/c-est-un-gros-lourd-pierre-menes-vise-par-de-nouveaux-temoignages-de-journalistes.jpg"));
        contacts.add(new Contact("Arthur","Rimbault", "https://cdn.radiofrance.fr/s3/cruiser-production/2019/11/8b4794fb-a081-4223-a623-2cbef9909478/260x348_gettyimages-89861180.webp"));
        contacts.add(new Contact("Richard","Coeur de lion", "https://i2.wp.com/www.histoire-normandie.fr/wp-content/uploads/2016/08/richard_coeur_lion_blondel.jpg"));
        contacts.add(new Contact("Zinedine","Zidane", "https://assets-fr.imgfoot.com/media/cache/642x382/zinedine-zidane-60586c1fc711d.jpg"));

        // Création d'un adapter avec initialisation du constructeur avec notre liste de contacts
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        // On notifie au recyclerview notre adapter
        rvContacts.setAdapter(adapter);
        // On déclare quelle type de LayoutManager on désire
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}