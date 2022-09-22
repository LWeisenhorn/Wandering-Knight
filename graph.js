function nodeLabel() {
    // Squares on board are A -> G, 1 -> 8
    let letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G'];
    
    for(let i = 0; i < letters.length; i++) {
        for(let j = 1; j < 9; j++) {
            let nodeName = letters[i] + j;
            console.log("Node " + nodeName + " was just created");
        }
    }
}
nodeLabel();