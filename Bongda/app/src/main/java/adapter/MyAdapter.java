package adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phamduyen.bongda.R;

import java.util.ArrayList;

import bean.Person;

/**
 * Created by Pham Duyen on 23/04/2016.
 */
public class MyAdapter extends ArrayAdapter<Person> {
    Activity mContext = null;
    int idLayout;
    ArrayList<Person> arrlistPerrson = new ArrayList<>();
    public MyAdapter(Context context, int resource) {
        super(context, resource);
    }

    public MyAdapter(Activity mContext,int idlayout,ArrayList<Person> arrperson)
    {
        super(mContext, idlayout, arrperson);
        this.mContext=mContext;
        this.idLayout=idlayout;
        this.arrlistPerrson=arrperson;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder = null ;
        if (view!= null){
            viewHolder=(ViewHolder) view.getTag();
        }
        else {
            viewHolder =  new ViewHolder();
            LayoutInflater layout = mContext.getLayoutInflater();
            view=layout.inflate(idLayout,null);

            viewHolder.tvname= (TextView) view.findViewById(R.id.textName);
            viewHolder.tvsdt=(TextView) view.findViewById(R.id.textSdt);
            viewHolder.imaview=(ImageView) view.findViewById(R.id.imageView);
            /*viewHolder.xem= (Button)view.findViewById(R.id.btnXoa);*/

            view.setTag(viewHolder);
        }

        Person contact= arrlistPerrson.get(position);
        viewHolder.tvname.setText("\t\tName : " + contact.getName());
        viewHolder.tvsdt.setText("\t\tPhone : " + contact.getSdt());
        notifyDataSetChanged();
        return view;
    }

    class ViewHolder{
        TextView tvname;
       // Button xem;
        ImageView imaview;
        TextView tvsdt;
    }


}
