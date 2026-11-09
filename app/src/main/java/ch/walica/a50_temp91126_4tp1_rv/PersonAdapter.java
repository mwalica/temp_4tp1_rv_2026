package ch.walica.a50_temp91126_4tp1_rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ch.walica.a50_temp91126_4tp1_rv.model.Person;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> people;

    public PersonAdapter(List<Person> people) {
        this.people = people;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.bind(people.get(position));
    }

    @Override
    public int getItemCount() {
        return people.size();
    }


    class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvAge;
        ImageView ivDelete;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            ivDelete = itemView.findViewById(R.id.ivDelete);

            ivDelete.setOnClickListener(v -> {
                int pos = getAbsoluteAdapterPosition();
                if(pos != RecyclerView.NO_POSITION) {
                    people.remove(people.get(pos));
                    notifyItemRemoved(pos);
                }
            });
        }

        public void bind(Person person) {
            tvName.setText(person.getName());
            tvAge.setText(person.getAge() + " lat");
        }
    }
}
