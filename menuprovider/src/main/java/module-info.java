
module org.example.menuprovider {
    requires org.example.menuservice;
    provides org.example.menuservice.menu.Menu with org.example.menuprovider.provider.EnglishMenu, org.example.menuprovider.provider.SwedishMenu, org.example.menuprovider.provider.SpanishMenu;
}
