package org.example.menuservice.menu;

public interface Menu {
    public String getTitle();
    public void setTitle(String title);
    public String getDescription();
    public void setDescription(String description);
    public String getIcon();
    public void setIcon(String icon);

    public Menu getNext();
    public Menu getPrevious();
    public void setNext(Menu menu);
    public void setPrevious(Menu menu);
    public void exit();

}
