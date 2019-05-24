The DecisionTree class is a flexible way to build choose-your own adventure stories. It's great for Java classes, or fun little
side projects. To start, create an instance of `DecisionTree`:
```java
DecisionTree story = new DecisionTree("You sit by a lake, tired. Blue water flows by you. Do you drink the water?");
```
Then, pass the instance constructor two more instances of decision tree:
```java
DecisionTree story =
      new DecisionTree(
        "You sit by a lake, tired. Blue water flows by you. Do you drink the water?",
        new DecisionTree(
          "You bend in and drink the water. It tastes sweet. Do you look for fish to catch in the water?",
          new DecisionTree("You look for fish. As you do, a shark swims by and attacks you. You die."),
          new DecisionTree("You withdraw from the water as a shark passes by, escaping death by moments.")
        ),
        new DecisionTree("You refrain from drinking the water. A few minutes later, a shark swims by. You realize that had you entered the water, you would have died.")
      );
```
When a decision tree instance is only passed a string, it is considered the end of the story.

Then, to "use" your story, use the `static` `tell` method of `DecisionTree`:
```java
DecisionTree.tell(story);
```
Then boot up the console, and watch the magic happen (okay - a yes/no story isn't magical, but it is still cool that you can create one in only two lines of code.)
