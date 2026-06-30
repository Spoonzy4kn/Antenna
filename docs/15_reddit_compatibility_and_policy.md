# Reddit Compatibility and Policy-Safe Access

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document defines the boundaries for Antenna's Version 1 Reddit compatibility target.

Antenna must remain independent and must not be designed around bypassing technical or policy restrictions.

---

## 2. Positioning

Antenna may be described as Reddit-compatible for Version 1.

Antenna must not be described as:

- Official Reddit software.
- Affiliated with Reddit.
- Endorsed by Reddit.
- Sponsored by Reddit.

The repository, README, app About screen, and public listings should include an independent project disclaimer.

---

## 3. Compatibility principles

Antenna should:

- Use supported access methods.
- Respect rate limits and restrictions.
- Respect authentication requirements.
- Respect NSFW and content restrictions.
- Clearly communicate unavailable or restricted content.
- Avoid implying that local settings override platform rules.

Antenna should not:

- Bypass access restrictions.
- Scrape or automate in ways that violate selected access method constraints.
- Misrepresent itself as official.
- Hide account requirements from users.

---

## 4. Anonymous browsing boundary

Anonymous browsing is a core Version 1 objective where technically possible.

Anonymous users may be able to:

- Browse public communities.
- View public posts.
- Read comments.
- Search where supported.
- Save local favourites.

Anonymous users should not be promised:

- Voting.
- Commenting.
- Posting.
- Reporting.
- Messages.
- Notifications.
- Platform-managed subscriptions.
- Account-specific settings.

---

## 5. Account-required behaviour

If a feature requires an account, Antenna should state this clearly.

Suggested copy:

```text
This action requires a platform account.
Antenna can still be used for anonymous browsing where supported.
```

Account features should be separated from anonymous browsing in requirements, UI, architecture, tests, and privacy documentation.

---

## 6. NSFW compatibility

Antenna shall hide or restrict NSFW content by default.

The local NSFW setting:

- Requires over-18 confirmation before enabling.
- Controls Antenna's display behaviour where content metadata is available.
- Does not override platform restrictions.
- Must be clearly explained in Settings.

---

## 7. Platform error handling

Antenna should map platform limitations to clear user states:

| Platform condition | User-facing state |
| --- | --- |
| Community unavailable | Not found or unavailable. |
| Community private/restricted | Restricted. |
| Account required | Account required. |
| Rate limited | Rate limited / try later. |
| Unsupported media | Unsupported content. |
| Network failure | Offline or network error. |
| Malformed response | Unexpected error. |

---

## 8. Open decisions

The following must be finalised during implementation:

- Exact supported access method.
- Authentication support timing.
- Rate-limit handling approach.
- Media handling limitations.
- External link behaviour.
- Minimum platform data required for features.

---

## 9. Summary

Antenna's Reddit compatibility should be useful, honest, and policy-safe. The application should respect platform constraints and explain limitations rather than pretending they do not exist.
