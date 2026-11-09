package ch.walica.a50_temp91126_4tp1_rv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ch.walica.a50_temp91126_4tp1_rv.model.Person;

public class PersonAdapter implements RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> people;

    public PersonAdapter(List<Person> people) {
        this.people = people;
    }


    class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvAge;
        ImageView ivDelete;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
