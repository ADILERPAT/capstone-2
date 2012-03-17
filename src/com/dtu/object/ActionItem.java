/**
 * 
 */
package com.dtu.object;

/**
 * @author dinh.vandinh
 *
 */

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class ActionItem {
	private Drawable icon;
	private Bitmap thumb;
	//private String title;
	private int actionId = -1;
    private boolean selected;
    private boolean sticky;
    
    public ActionItem(int actionId,Drawable icon) {
        //this.title = title;
        this.icon = icon;
        this.actionId = actionId;
    }
    public ActionItem() {
        this(-1, null);
    }
    public ActionItem(int actionId) {
        this(actionId, null);
    }
    public ActionItem(Drawable icon) {
        this(-1, icon);
    }
    public void setIcon(Drawable icon) {
		this.icon = icon;
	}
    public Drawable getIcon() {
		return this.icon;
	}
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }
    public int getActionId() {
        return actionId;
    }
    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }
    public boolean isSticky() {
        return sticky;
    }
    public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	/**
	 * Check if item is selected
	 * 
	 * @return true or false
	 */
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * Set thumb
	 * 
	 * @param thumb Thumb image
	 */
	public void setThumb(Bitmap thumb) {
		this.thumb = thumb;
	}
	
	/**
	 * Get thumb image
	 * 
	 * @return Thumb image
	 */
	public Bitmap getThumb() {
		return this.thumb;
	}

}
