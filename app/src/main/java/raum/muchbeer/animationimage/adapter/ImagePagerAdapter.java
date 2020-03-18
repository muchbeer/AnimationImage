package raum.muchbeer.animationimage.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import raum.muchbeer.animationimage.fragment.ImageFragment;

import static raum.muchbeer.animationimage.adapter.ImageData.IMAGE_DRAWABLES;

public class ImagePagerAdapter  extends FragmentStatePagerAdapter {
   // private final Context mContext;

    public ImagePagerAdapter(@NonNull Fragment fragment) {
      super(fragment.getChildFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(IMAGE_DRAWABLES[position]);
    }

    @Override
    public int getCount() {
        return IMAGE_DRAWABLES.length;
    }
}
