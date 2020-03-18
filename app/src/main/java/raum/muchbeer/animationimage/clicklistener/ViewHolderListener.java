package raum.muchbeer.animationimage.clicklistener;

import android.view.View;
import android.widget.ImageView;

public interface ViewHolderListener {
    /**
     * A listener that is attached to all ViewHolders to handle image loading events and clicks.
     */

    void onLoadCompleted(ImageView view, int adapterPosition);

    void onItemClicked(View view, int adapterPosition);

}
