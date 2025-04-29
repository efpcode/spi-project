module org.example.menuconsumer {
    requires org.example.menuservice;
    uses org.example.menuservice.menu.Menu;
    exports org.example.menuconsumer.consumer;
}
