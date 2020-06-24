class Statically {
  //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
  #glue = "Epoxy";
  jello = "Jello";
  moveAndShake() {
    console.log("Never stagnate in life.  Be agile, change, and improve...");
  }

  static stubborn() {
    console.log("Please don't make me change... I just don't like it...");
  }

  explain() {
    console.log(
      "Unlike Java, static methods in javascript are used to create utility functions for an application, static methods have no access to data stored in specific objects"
    );
    //write an explanation for how the keyword static behaves differently in javascript vs. java.
  }
  glueAndJello() {
    console.log(this.#glue);
    console.log(this.jello);
  }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.stubborn();
stats.moveAndShake();
stats.explain();

stats.glueAndJello();

//Once you have finished getting statistically.js to run, refactor the code here in Java.
