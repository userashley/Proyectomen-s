package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
	        // Crear menús y elementos de menú
	        Menu archivoMenu = new Menu("Archivo");
	        MenuItem nuevoMenuItem = new MenuItem("Nuevo");
	        MenuItem abrirMenuItem = new MenuItem("Abrir");
	        MenuItem guardarMenuItem = new MenuItem("Guardar");
	        MenuItem salirMenuItem = new MenuItem("Salir");
	        archivoMenu.getItems().addAll(nuevoMenuItem, abrirMenuItem, guardarMenuItem, new SeparatorMenuItem(), salirMenuItem);

	        Menu editarMenu = new Menu("Editar");
	        MenuItem cortarMenuItem = new MenuItem("Cortar");
	        MenuItem copiarMenuItem = new MenuItem("Copiar");
	        MenuItem pegarMenuItem = new MenuItem("Pegar");
	        editarMenu.getItems().addAll(cortarMenuItem, copiarMenuItem, pegarMenuItem);

	        Menu ayudaMenu = new Menu("Ayuda");
	        MenuItem acercaDeMenuItem = new MenuItem("Acerca de...");
	        ayudaMenu.getItems().add(acercaDeMenuItem);

	        // Crear la barra de menú y agregarle los menús
	        MenuBar barraMenu = new MenuBar();
	        barraMenu.getMenus().addAll(archivoMenu, editarMenu, ayudaMenu);

	        // Crear un área de contenido (opcional)
	        BorderPane contenido = new BorderPane();

	        // Configurar el layout
	        BorderPane layout = new BorderPane();
	        layout.setTop(barraMenu);
	        layout.setCenter(contenido);

	        // Definir acciones para los elementos del menú (ejemplo simple)
	        nuevoMenuItem.setOnAction(event -> System.out.println("Nuevo archivo creado"));
	        abrirMenuItem.setOnAction(event -> System.out.println("Abrir archivo"));
	        guardarMenuItem.setOnAction(event -> System.out.println("Guardar archivo"));
	        cortarMenuItem.setOnAction(event -> System.out.println("Cortar texto"));
	        copiarMenuItem.setOnAction(event -> System.out.println("Copiar texto"));
	        pegarMenuItem.setOnAction(event -> System.out.println("Pegar texto"));
	        salirMenuItem.setOnAction(event -> System.exit(0));
	        acercaDeMenuItem.setOnAction(event -> mostrarAcercaDe());
			
			
			BorderPane root = new BorderPane(layout);
			Scene scene = new Scene(root,400,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void mostrarAcercaDe() {
        // Implementar el contenido de la ventana "Acerca de..."
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ACERCA DEL PROYECTO Menú ");
        alert.setHeaderText("Información de la Practica Menu");
        alert.setContentText("Esta es una practica de ejemplo que muestra una barra de menú en JavaFX.");
        alert.showAndWait();
    }

	public static void main(String[] args) {
		launch(args);
	}


}

