package ke.co.insuranceapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ke.co.insuranceapp.R;

public class LeadViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTv;
    public TextView phoneTv;
    public TextView emailTv;

    public LeadViewHolder(View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.nameTv);
        phoneTv = itemView.findViewById(R.id.phoneTv);
        emailTv = itemView.findViewById(R.id.emailTv);
    }
}
