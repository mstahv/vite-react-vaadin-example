import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import vaadinLogo from '/vaadin.svg'

import './App.css'

declare global {
  namespace JSX {
    interface IntrinsicElements {
      'newsletter-subscription': React.DetailedHTMLProps<React.HTMLAttributes<HTMLElement>,HTMLElement>;
    }
  }
}


/* This React component shows the embedded Vaadin component conditionally. */
function Vaadin({ count } : VaadinProps) {
  if (count > 0) {
    return <div>
        <p>Now that you clicked once on the React appp, we'll show you a Vaadin app as well:</p>
        <newsletter-subscription></newsletter-subscription>
      </div>;
  }
  return null;
}
type VaadinProps = {count: number}

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
        <a href="https://vaadin.com" target="_blank">
          <img src={vaadinLogo} className="logo" alt="Vaadin logo" />
        </a>
      </div>
      <h1>Vite + React + Vaadin</h1>
      <div className="card">
        <p>Click the button below, it will count your clicks and show a Vaadin view after the first click.</p>
        <button onClick={() => setCount((count) => count + 1)}>
          Click me, count is {count}
        </button>
        <div>
          {/* 
            * In simple case you could drop <newsletter-subscription></newsletter-subscription>
            * here directly. This example wraps in another React component that shows it based
            * on certain conditions only.
            */}
          <Vaadin count={count}></Vaadin>
        </div>
      </div>
      <p className="read-the-docs">
        Click on the logos to learn more
      </p>
    </>
  )
}

export default App
