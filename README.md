# RabbitAndWolf-Minigame

This is a mini-game where the wolf is tries to eat the rabbit and the rabbit tries to eat all the carrots. The game itself is GUI that is created using the Processing library. The game was intended to be a 2 player game (where one player is the rabbit, and the other the wolf) but it can also be played with only one player. When making the mini-game the main idea was to create something that is customizable to the individuals who are playing the game by adding carrots multiple times, add one or more wolfs or rabbits or just restarting. 
Few important things to consider:
  • Carrots are non interactive images. They do not react to the mouse events or to key pressed by the user.
  • Interactive objects such as buttons and animals (rabbits and wolves) are graphic objects created using GUI-Interface called listeners. 
  • This objects which react to the mouse events or specific key pressed. They define common properties and common behaviors. But they act differently in the
    patch. Each animal/button has a specific behavior indeed.
