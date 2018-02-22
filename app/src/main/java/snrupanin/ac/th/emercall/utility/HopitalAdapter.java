package snrupanin.ac.th.emercall.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import snrupanin.ac.th.emercall.R;

/**
 * Created by DSS on 02/22/18.
 */

public class HopitalAdapter extends BaseAdapter{

     // Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrtngs, phoneStringe;

    public HopitalAdapter(Context context, int[] ints, String[] titleStrtngs, String[] phoneStringe) {
        this.context = context;
        this.ints = ints;
        this.titleStrtngs = titleStrtngs;
        this.phoneStringe = phoneStringe;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_layout, viewGroup, false);

        ImageView imageView = view1.findViewById(R.id.imageListView);
        TextView titleTextView = view1.findViewById(R.id.textTitle);
        TextView phoneTextView = view1.findViewById(R.id.textViewPhone);

        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrtngs[i]);
        phoneTextView.setText(phoneStringe[i]);

        return view1;



    }
}  // Main Class
