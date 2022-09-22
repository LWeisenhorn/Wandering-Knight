function drawBoard() {
    const canvas = document.querySelector('#canvas');
    if(!canvas.getContext) {
        return;
    }

    const ctx = canvas.getContext('2d');
    ctx.strokeStyle = 'black';
    ctx.lineWidth = 2;

    ctx.beginPath();
    ctx.moveTo(25, 25);
    ctx.lineTo(475, 25);
    ctx.lineTo(475, 475);
    ctx.lineTo(25, 475);
    ctx.lineTo(25, 25);
    ctx.stroke();

    for(let i = 25; i < 475; i += 100) {
        for(let j = 25; j < 475; j += 100) {
            ctx.fillRect(i , j, 50, 50);
        }
    }
    for(let i = 75; i < 475; i += 100) {
        for(let j = 75; j < 475; j += 100) {
            ctx.fillRect(i , j, 50, 50);
        }
    }
}

function drawNodes() {
    const canvas = document.querySelector('#canvas');
    if(!canvas.getContext) {
        return;
    }

    const ctx = canvas.getContext('2d');
    ctx.strokeStyle = 'black';
    ctx.lineWidth = 1;

    for(let i = 50; i < 500; i += 50) {
        for(let j = 50; j < 500; j += 50) {
            ctx.beginPath();
            ctx.moveTo(i, j);
            ctx.lineTo(i + 5, j);
            ctx.lineTo(i - 5, j);
            ctx.lineTo(i, j);
            ctx.lineTo(i, j + 5);
            ctx.lineTo(i, j - 5);
            ctx.stroke();
        }
    }
}

function drawNodeConnections() {
    const canvas = document.querySelector('#canvas');
    if(!canvas.getContext) {
        return;
    }

    const ctx = canvas.getContext('2d');
    ctx.strokeStyle = 'red';
    ctx.lineWidth = 1;

    for(let i = 50; i < 500; i += 50) {
        for(let j = 50; j < 500; j += 50) {
            ctx.beginPath();
            console.log("Running...");
            ctx.moveTo(i, j);
        
            // ___|
            if((i >= 50 && i <= 350) && (j >= 100 && j <= 450)) {
                ctx.lineTo(i + 100, j - 50);
                ctx.moveTo(i, j);
                ctx.stroke();
            }
            
            // |___
            if((i >= 50 && i <= 350) && (j >= 0 && j <= 400)) {
                ctx.lineTo(i + 100, j + 50);
                ctx.moveTo(i, j);
                ctx.stroke();
            }
            // _|
            if((i >= 100 && i <= 450) && (j >= 0 && j <= 350)) {
                ctx.lineTo(i - 50, j + 100);
                ctx.moveTo(i, j);
                ctx.stroke();
            }
            // |_
            if((i >= 50 && i <= 400) && (j >= 0 && j <= 350)) {
                ctx.lineTo(i + 50, j + 100);
                ctx.moveTo(i, j);
                ctx.stroke();
            }
        }
    }
}

function visualize() {
    drawBoard();
    drawNodes();
    drawNodeConnections();
}
visualize();